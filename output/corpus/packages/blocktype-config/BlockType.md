# BlockType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: JsonAssetWithMap<String, BlockTypeAssetMap<String, BlockType>>, NetworkSerializable<com.hypixel.hytale.protocol.BlockType>

The central block type definition asset. Contains all configurable properties for a block in the game: material, textures, collision boxes, movement settings, gathering behavior, placement rules, support requirements, farming data, bench configuration, rotation variants, states, and more. Defined within Item assets, not standalone. This is the largest and most referenced type in the block system.
