# DeathSystems.PlayerDeathScreen

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DeathSystems.OnDeathSystem

public static class DeathSystems.PlayerDeathScreen extends DeathSystems.OnDeathSystem

Opens the respawn page on the player's page manager when a player dies, if `showDeathMenu` is true. Generates the death message from the killing `Damage` event and passes it along with the item loss data to the `RespawnPage`.

## Related Types

- DeathSystems -- parent class
- DeathComponent -- reads death message and item loss data
- DeathSystems.OnDeathSystem -- base class
