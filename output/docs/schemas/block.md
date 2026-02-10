---
title: "Block Type Schema"
kind: "schema"
asset_type: "BlockType"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "schemas"
  - "json"
  - "block"
  - "asset"
---

> Class: `com.hypixel.hytale.server.core.asset.type.blocktype.config.BlockType`
> Codec: `AssetBuilderCodec<String, BlockType>`

Block type definitions control how a block is rendered, how it interacts with physics and entities, and what gameplay behaviors it has. BlockType is defined as a nested asset within an [Item](item.md) definition (via the `BlockType` JSON field), not as a standalone asset file. The codec uses `appendInherited` for most fields, enabling asset pack inheritance chains.

## Schema Fields

### Rendering

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `DrawType` | `DrawType` | `string` (enum: Cube, Model, Cross, Empty, Fluid, ...) | yes | `"Cube"` | How the block is rendered. Cube is standard voxel, Model uses a custom 3D model, Cross renders as X-shaped planes. |
| `Textures` | `BlockTypeTextures[]` | `array of objects` | no | `null` | Block face textures. Each entry defines Up/Down/North/South/East/West texture paths and a weight for random selection. |
| `TextureSideMask` | `String` | `string` | no | `null` | Texture used as a side mask overlay. |
| `CubeShadingMode` | `ShadingMode` | `string` (enum: Standard, Flat) | yes | `"Standard"` | Shading mode for cube-type blocks. |
| `CustomModel` | `String` | `string` | no | `null` | Path to a `.blockymodel` file for Model draw type blocks. |
| `CustomModelTexture` | `CustomModelTexture[]` | `array of objects` | no | `null` | Textures for custom model blocks. Each entry has a texture path and a weight. |
| `CustomModelScale` | `Float` | `number` | no | `1.0` | Scale factor for custom model blocks. |
| `CustomModelAnimation` | `String` | `string` | no | `null` | Animation file path for animated custom model blocks. |
| `Looping` | `Boolean` | `boolean` | no | `false` | Whether the block's custom model animation loops. |
| `Opacity` | `Opacity` | `string` (enum: Solid, Transparent, SemiTransparent) | yes | `"Solid"` | Light transmission behavior. |
| `RequiresAlphaBlending` | `Boolean` | `boolean` | no | `false` | Whether the block texture requires alpha blending for transparency. |
| `Effect` | `ShaderType[]` | `array of strings` (enum: None, Foliage, Water, ...) | no | `["None"]` | Shader effects applied to the block. |
| `RandomRotation` | `RandomRotation` | `string` (enum: None, Yaw, Full, ...) | yes | `"None"` | Random rotation applied when block is placed for visual variety. |
| `VariantRotation` | `VariantRotation` | `string` (enum: None, Yaw, Debug) | yes | `"None"` | Variant-based rotation for block states. |
| `FlipType` | `BlockFlipType` | `string` (enum) | no | `"SYMMETRIC"` | How the block can be flipped. |
| `RotationYawPlacementOffset` | `Rotation` | `string` (enum: None, 90, 180, 270) | yes | `"None"` | Yaw rotation offset applied at placement time. |
| `TransitionTexture` | `String` | `string` | no | `null` | Texture used for smooth transitions between this block and adjacent blocks. |
| `TransitionToGroups` | `String[]` | `array of strings` | no | `null` | Block groups this block transitions to visually. |
| `TransitionToTag` | `String` | `string` | no | `null` | Block tag this block transitions to visually. |
| `Light` | `ColorLight` | `object` (color + intensity) | no | `null` | Light emitted by this block when placed in the world. |

### Tinting

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Tint` | `Color[]` | `array of hex color strings` | no | `null` | Color tint applied to all block faces (shorthand). |
| `TintUp` | `Color[]` | `array of hex color strings` | no | `null` | Color tint for the top face. |
| `TintDown` | `Color[]` | `array of hex color strings` | no | `null` | Color tint for the bottom face. |
| `TintNorth` | `Color[]` | `array of hex color strings` | no | `null` | Color tint for the north face. |
| `TintSouth` | `Color[]` | `array of hex color strings` | no | `null` | Color tint for the south face. |
| `TintWest` | `Color[]` | `array of hex color strings` | no | `null` | Color tint for the west face. |
| `TintEast` | `Color[]` | `array of hex color strings` | no | `null` | Color tint for the east face. |
| `BiomeTint` | `Integer` | `integer` (biome color index) | no | `null` | Biome color index applied to all faces (shorthand). |
| `BiomeTintUp` | `Integer` | `integer` | no | `0` | Biome color index for the top face. |
| `BiomeTintDown` | `Integer` | `integer` | no | `0` | Biome color index for the bottom face. |
| `BiomeTintNorth` | `Integer` | `integer` | no | `0` | Biome color index for the north face. |
| `BiomeTintSouth` | `Integer` | `integer` | no | `0` | Biome color index for the south face. |
| `BiomeTintWest` | `Integer` | `integer` | no | `0` | Biome color index for the west face. |
| `BiomeTintEast` | `Integer` | `integer` | no | `0` | Biome color index for the east face. |

### Physics & Collision

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Material` | `BlockMaterial` | `string` (enum: Solid, Empty, Liquid, ...) | yes | `"Empty"` | Physical material type. Affects collision, sound, and physics behavior. |
| `HitboxType` | `String` | `string` | no | `"Full"` | Reference to a BlockBoundingBox asset defining the collision shape. |
| `InteractionHitboxType` | `String` | `string` | no | `null` | Separate hitbox for interaction raycasting (can differ from collision hitbox). |
| `MovementSettings` | `BlockMovementSettings` | `object` | no | `null` | Custom movement modifiers when entities walk on/through this block (e.g., slow, slip). |
| `DamageToEntities` | `Integer` | `integer` | no | `0` | Damage dealt to entities standing on/in this block (e.g., cacti, lava). |

### Block Support

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Support` | `Map<BlockFace, RequiredBlockFaceSupport[]>` | `object` (face -> support requirements) | no | `null` | Required support conditions per face. Empty means block is always supported. |
| `Supporting` | `Map<BlockFace, BlockFaceSupport[]>` | `object` (face -> support provided) | no | `null` | Support this block provides to adjacent blocks per face. |
| `SupportDropType` | `SupportDropType` | `object` | no | `null` | What happens when block support is lost (drop as item, destroy, convert to physics entity). |
| `MaxSupportDistance` | `Integer` | `integer` (0-14) | no | `null` | Maximum distance at which this block can provide structural support. |
| `SupportsRequiredFor` | `BlockSupportsRequiredForType` | `string` (enum: All, Existence, Physics) | yes | `"All"` | What the support requirement applies to. |
| `IgnoreSupportWhenPlaced` | `Boolean` | `boolean` | no | `false` | Whether support requirements are ignored when a player places this block. |

### Gameplay

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `Group` | `String` | `string` | no | `null` | Block group identifier. Used by BlockSets. A group of `@Tech` prevents physics from being applied. |
| `Flags` | `BlockFlags` | `object` {IsUsable, IsStackable} | no | `null` | Boolean flags. IsUsable: block can be used/interacted with. IsStackable: blocks can be stacked. |
| `IsDoor` | `Boolean` | `boolean` | no | `false` | Whether this block behaves as a door (open/close interaction). |
| `AllowsMultipleUsers` | `Boolean` | `boolean` | no | `false` | Whether multiple players can use this block simultaneously (e.g., large benches). |
| `Interactions` | `Map<InteractionType, String>` | `object` (enum keys -> RootInteraction asset refs) | no | `null` | Maps interaction types to RootInteraction assets defining block use behavior. |
| `InteractionHint` | `String` | `string` | no | `null` | Translation key for text shown under crosshair when aiming at block. `{key}` is replaced with interaction binding. |
| `Bench` | `Bench` | `object` | no | `null` | Crafting bench configuration if this block is a crafting station. |
| `Gathering` | `BlockGathering` | `object` | no | `null` | Resource gathering configuration for harvestable blocks. |
| `PlacementSettings` | `BlockPlacementSettings` | `object` | no | `null` | Custom placement behavior and constraints. |
| `Farming` | `FarmingData` | `object` | no | `null` | Farming/crop growth configuration for agricultural blocks. |
| `TickProcedure` | `TickProcedure` | `object` | no | `null` | Defines block tick behavior (e.g., crop growth, fire spread). |
| `Seats` | `RotatedMountPointsArray` | `object` | no | `null` | Seat mount points for sittable blocks (chairs, benches). |
| `Beds` | `RotatedMountPointsArray` | `object` | no | `null` | Bed mount points for sleeping blocks. |
| `ConnectedBlockRuleSet` | `ConnectedBlockRuleSet` | `object` | no | `null` | Rules for connected block textures (e.g., fences, walls that connect to neighbors). |
| `State` | `StateData` | `object` | no | `null` | Block state configuration (e.g., multi-state blocks like doors open/closed, crops growth stages). |
| `BlockEntity` | `Holder<ChunkStore>` | `object` (ECS component holder) | no | `null` | ECS components attached to this block as a block entity (e.g., inventory, display data). |
| `Rail` | `RailConfig` | `object` | no | `null` | Rail configuration for minecart-style rail blocks. |

### Sound & Particles

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `BlockSoundSetId` | `String` | `string` | no | `"EMPTY"` | Reference to a BlockSoundSet for placement, breaking, and step sounds. |
| `AmbientSoundEventId` | `String` | `string` | no | `null` | Looping ambient sound emitted by this block when placed or held. |
| `InteractionSoundEventId` | `String` | `string` | no | `null` | One-shot sound played when interacting with this block. |
| `BlockBreakingDecalId` | `String` | `string` | no | `null` | Reference to a BlockBreakingDecal asset overlaid when block is damaged. |
| `BlockParticleSetId` | `String` | `string` | no | `null` | Reference to a BlockParticleSet for particles spawned on entity interaction (stepping, breaking). |
| `ParticleColor` | `Color` | `string` (hex color) | no | `null` | Color tint for block interaction particles. |
| `Particles` | `ModelParticle[]` | `array of objects` | no | `null` | Ambient particles spawned on top of placed blocks of this type. |

### References

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `BlockListAssetId` | `String` | `string` | no | `null` | Reference to a BlockList asset for use in builder tool brushes. |
| `PrefabListAssetId` | `String` | `string` | no | `null` | Reference to a PrefabList asset for use in builder tool brushes. |
| `Aliases` | `String[]` | `array of strings` | no | `null` | Alternative names for this block type used in command matching. |

## Related

- **[Item Schema](item.md)** — Parent asset type (BlockType is nested within Item)
- **[JSON Asset Schemas Overview](index.md)** — BuilderCodec pattern documentation
- **[ECS Overview](../api/components/index.md)** — BlockEntity uses ECS components
