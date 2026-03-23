# ConsoleSender

Type: class | Package: com.hypixel.hytale.server.core.console | Implements: CommandSender

public class ConsoleSender implements CommandSender

Implementation of `CommandSender`.

## Constructors

- ConsoleSender() | Creates a new ConsoleSender instance.

## Methods

- sendMessage(@Nonnull Message message) | void | public method.
- getDisplayName() | String | public method.
- getUuid() | UUID | public method.
- hasPermission(@Nonnull String id) | boolean | public method.
- hasPermission(@Nonnull String id, boolean def) | boolean | public method.

Also in this package: ConsoleModule, ConsoleRunnable

Complete API:
  public void sendMessage(Message message)
  public String getDisplayName()
  public UUID getUuid()
  public boolean hasPermission(String id)
  public boolean hasPermission(String id, boolean def)

Fields:
public static final ConsoleSender INSTANCE
private final UUID uuid
