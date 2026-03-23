# BlockMigration

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: JsonAssetWithMap<Integer, DefaultAssetMap<Integer, BlockMigration>>

Handles block type ID migration between versions. Maps old block type keys to new ones via `directMigrations` and `nameMigrations` maps. Used during world loading to update blocks to their current identifiers.
