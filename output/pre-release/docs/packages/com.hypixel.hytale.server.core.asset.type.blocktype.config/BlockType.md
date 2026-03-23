---
title: "BlockType"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.BlockType"
api_surface: true
extends: "java.lang.Object"
implements:
  - "JsonAssetWithMap"
  - "NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "blocktype"
  - "registry"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config`

```java
public class BlockType implements JsonAssetWithMap<String, BlockTypeAssetMap<String, BlockType>>, NetworkSerializable<com.hypixel.hytale.protocol.BlockType>
```

The primary asset definition for a block in the game. Defines all visual, physical, and gameplay properties of a block type including textures, draw type, material, opacity, collision shapes, sound sets, particle effects, tick procedures, interaction types, farming data, bench configuration, connected block rules, and state data. Cannot be defined standalone -- must be defined within an `Item` asset.

## Key Methods

```java
@Nullable
public static BlockType fromString(@Nonnull String input)
```

Looks up a block type by its string asset key.

```java
public static AssetStore<String, BlockType, BlockTypeAssetMap<String, BlockType>> getAssetStore()
```

Returns the global asset store for block types.

```java
public static BlockTypeAssetMap<String, BlockType> getAssetMap()
```

Returns the asset map for block types.

```java
public String getId()
```

Returns the asset key of this block type.

```java
@Nullable
public Item getItem()
```

Returns the parent `Item` that defines this block type.

```java
public boolean isState()
```

Returns whether this block type is a state variant of another block type.

```java
@Nullable
public BlockType getBlockForState(@Nonnull String state)
```

Returns the block type associated with the given state name.

```java
public DrawType getDrawType()
```

Returns the draw type (rendering mode) for this block.

```java
public BlockMaterial getMaterial()
```

Returns the physical material of this block.

```java
public Opacity getOpacity()
```

Returns the opacity setting of this block.

## Related Types

- [StateData](StateData.md) -- block state variant mapping
- [Rotation](Rotation.md) -- block rotation
- [ConditionalBlockSound](ConditionalBlockSound.md) -- conditional sounds for this block
- [BlockFlipType](BlockFlipType.md) -- flip type for editor mirroring
- `Item` -- parent item asset
