# StateData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object

Defines block state mappings. Maps state names to block type keys via `stateToBlock` and maintains the reverse `blockToState` mapping. Used for block state transitions (e.g., on/off, open/closed). The `Definitions` field uses `ContainedAssetCodec` to inline block type definitions within the state data.
