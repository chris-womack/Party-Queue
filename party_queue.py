"""Hello World API implemented using Google Cloud Endpoints.

Defined here are the ProtoRPC messages needed to define Schemas for methods
as well as those methods defined in an API.
"""


# THE FOLLOWING 4 IMPORTS ARE FOR GAE Enpoints integration
import endpoints
from protorpc import messages
from protorpc import message_types
from protorpc import remote


# Simple Hello world, will delete/update this with our application
package = 'Hello'


class Greeting(messages.Message):
  """Greeting that stores a message."""
  message = messages.StringField(1)


class GreetingCollection(messages.Message):
  """Collection of Greetings."""
  items = messages.MessageField(Greeting, 1, repeated=True)


STORED_GREETINGS = GreetingCollection(items=[
    Greeting(message='hello world!'),
    Greeting(message='goodbye world!'),
])


# SECOND SECTION
@endpoints.api(name='helloworld', version='v1')
class HelloWorldApi(remote.Service):
  """Helloworld API v1."""

  @endpoints.method(message_types.VoidMessage, GreetingCollection,
                    path='hellogreeting', http_method='GET',
                    name='greetings.listGreeting')
  def greetings_list(self, unused_request):
    return STORED_GREETINGS

  MULTIPLY_METHOD_RESOURCE = endpoints.ResourceContainer(
          Greeting,
          times=messages.IntegerField(2, variant=messages.Variant.INT32,
                                        required=true)
  @endpoints.method(MULTIPLY_METHOD_RESOURCE, Greeting, 
                    path='hellogreeting/{times}', http_method='POST',
                    name='greetings.multiply')

  ID_RESOURCE = endpoints.ResourceContainer(
      message_types.VoidMessage,
      id=messages.IntegerField(1, variant=messages.Variant.INT32))

  @endpoints.method(ID_RESOURCE, Greeting,
                    path='hellogreeting/{id}', http_method='GET',
                    name='greetings.getGreeting')
  def greeting_get(self, request):
    try:
      return STORED_GREETINGS.items[request.id]
    except (IndexError, TypeError):
      raise endpoints.NotFoundException('Greeting %s not found.' %
                                        (request.id,))

# THIRD SECION The casing of APPLICATION in this line must match the casing in the app.yaml file in the line script: helloworld_api.APPLICATION.
APPLICATION = endpoints.api_server([HelloWorldApi])
