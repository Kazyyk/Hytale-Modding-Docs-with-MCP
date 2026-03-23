# Damage.CommandSource

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Implements: Damage.Source

public static class Damage.CommandSource implements Damage.Source

A Damage.Source that identifies a command as the origin of the damage. Tracks both the `CommandSender` who executed the command and the command name.

## Constructors


public CommandSource(@Nonnull CommandSender commandSender, @Nonnull AbstractCommand cmd)

Creates a command source from a sender and a command object. The command name is extracted via `cmd.getName()`.


public CommandSource(@Nonnull CommandSender commandSender, @Nullable String commandName)

Creates a command source from a sender and an explicit command name string.

## Methods


@Nonnull
@Override
public Message getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Returns a localized death message using the `server.general.killedByCommand` translation key, parameterized with the sender's display name and the command name (or "Unknown" if null).

## Fields

- commandSender | CommandSender | private final | The sender who executed the command.
- commandName | String | private final | Name of the command, or `null`.

## Related Types

- Damage -- the damage event
- Damage.Source -- parent interface
