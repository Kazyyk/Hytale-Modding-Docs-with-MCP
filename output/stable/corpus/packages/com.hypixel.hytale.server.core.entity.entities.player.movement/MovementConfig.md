# MovementConfig

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.movement | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, MovementConfig>>, NetworkSerializable<MovementSettings>

public class MovementConfig implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, MovementConfig>>, NetworkSerializable<MovementSettings>

JSON-configured movement parameter set supporting inheritance. Defines velocity resistance, jump force, walk/sprint/crouch/swim speeds, gravity, and fly speed. Serializable to `MovementSettings` for network transmission.
