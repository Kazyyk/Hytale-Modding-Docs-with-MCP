# DesyncDamageCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage.commands | Extends: CommandBase

public class DesyncDamageCommand extends CommandBase

A debug command (`/desyncdamage`) that toggles the `CAUSE_DESYNC` flag on DamageSystems.FilterUnkillable. When enabled, all damage to all entities is cancelled, useful for debugging damage desynchronization issues.

## Constructor


public DesyncDamageCommand()

Registers the command with name `"desyncdamage"` and description key `"server.commands.damage.desyncdamage.desc"`.

## Methods


@Override
protected void executeSync(@Nonnull CommandContext context)

Toggles `DamageSystems.FilterUnkillable.CAUSE_DESYNC` and sends a feedback message indicating the new state.

## Related Types

- DamageSystems.FilterUnkillable -- the system whose flag this command toggles
- DamageModule -- registers this command
