---
title: "ChunkLightData"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.ChunkLightData"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "lighting"
  - "octree"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section`

```java
public class ChunkLightData
```

Immutable lighting data for a 32x32x32 chunk section, stored as an octree in a `ByteBuf`. Each leaf stores a 16-bit value encoding 4 channels (red, green, blue, sky) at 4 bits each. The octree structure compresses uniform regions into single nodes, providing efficient storage for sections with large areas of uniform lighting.

## Constants

| Constant | Type | Value | Description |
|---|---|---|---|
| `EMPTY` | `ChunkLightData` | -- | Singleton representing empty (no light) data. |
| `TREE_SIZE` | `int` | `8` | Number of children per octree node. |
| `DEPTH_MAGIC` | `int` | `12` | Maximum traversal depth (log2(32) * 3 + 3 = 15, but uses 12). |
| `SIZE_MAGIC` | `int` | `17` | Byte size of each octree node (1 mask + 8 x 2 bytes). |
| `MAX_VALUE` | `byte` | `15` | Maximum light value per channel. |
| `CHANNEL_COUNT` | `int` | `4` | Number of light channels (R, G, B, Sky). |
| `RED_CHANNEL` | `int` | `0` | Red channel index. |
| `GREEN_CHANNEL` | `int` | `1` | Green channel index. |
| `BLUE_CHANNEL` | `int` | `2` | Blue channel index. |
| `SKY_CHANNEL` | `int` | `3` | Sky channel index. |

## Instance Methods

```java
public short getChangeId()
```

Returns the change counter at the time this light data was built.

```java
public byte getRedBlockLight(int x, int y, int z)
```

```java
public byte getGreenBlockLight(int x, int y, int z)
```

```java
public byte getBlueBlockLight(int x, int y, int z)
```

```java
public byte getSkyLight(int x, int y, int z)
```

```java
public short getBlockLight(int x, int y, int z)
```

Returns the combined RGB light as a 12-bit value (no sky channel).

```java
public byte getBlockLightIntensity(int x, int y, int z)
```

Returns the maximum of the R, G, B channels.

```java
public short getLightRaw(int x, int y, int z)
```

Returns the raw 16-bit light value (all 4 channels).

```java
public byte getLight(int index, int channel)
```

Returns the light value for a specific channel at a flat index.

## Static Methods

```java
@Nonnull
public static ChunkLightData deserialize(@Nonnull ByteBuf buf, int version)
```

Deserializes lighting data from a versioned byte buffer.

```java
public static short combineLightValues(byte red, byte green, byte blue, byte sky)
```

Packs 4 channel values into a 16-bit light value.

```java
public static byte getLightValue(short value, int channel)
```

Extracts a single channel from a packed light value.

## Serialization

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes the octree to a byte buffer with a length prefix.

```java
public void serializeForPacket(@Nonnull ByteBuf buf)
```

Serializes the octree for network packets (little-endian shorts).
