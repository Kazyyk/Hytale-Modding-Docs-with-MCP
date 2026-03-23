# MessagesUpdated

Type: class | Package: com.hypixel.hytale.server.core.modules.i18n.event | Implements: IEvent

public class MessagesUpdated implements IEvent<Void>

Server lifecycle event.

## Accessors

- getChangedMessages() | Map<String, Map<String, String>> | Accessor method.
- getRemovedMessages() | Map<String, Map<String, String>> | Accessor method.

Also in this package: GenerateDefaultLanguageEvent

Complete API:
  public Map<String,Map<String,String>> getChangedMessages()
  public Map<String,Map<String,String>> getRemovedMessages()
  public String toString()

Fields:
private final Map<String,Map<String,String>> changedMessages
private final Map<String,Map<String,String>> removedMessages
