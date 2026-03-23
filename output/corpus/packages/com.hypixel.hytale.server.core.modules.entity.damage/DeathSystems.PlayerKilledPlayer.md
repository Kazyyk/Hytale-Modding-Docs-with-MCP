# DeathSystems.PlayerKilledPlayer

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.PlayerKilledPlayer extends DeathSystems.OnDeathSystem

Sends a "killed entity" chat message to the attacking player when they kill a named player entity via `PHYSICAL` or `PROJECTILE` damage. Only triggers if both the victim and attacker are `Player` entities and the victim has a `Nameplate` component.

## Related Types

- DeathSystems -- parent class
- DeathSystems.OnDeathSystem -- base class
- DamageCause -- checks for `PHYSICAL` and `PROJECTILE`
