# FlatWorldGenProvider.Layer

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen.provider

public static class Layer

## Fields

- public int from
- public int to
- public String environment
- public String blockType
- public int environmentId
- public int blockId

## Methods

- public Layer()
- public Layer(int from, int to, String environment, String blockType)
- public String toString()

Known subclasses: ConstantThicknessLayer, DynamicLayer, NoiseThickness, RangedThicknessLayer, StaticLayer, WeightedThicknessLayer

Also in this package: DummyWorldGen, DummyWorldGenProvider, FlatWorldGen, FlatWorldGenProvider, IWorldGenProvider, VoidWorldGen, VoidWorldGenProvider

Complete API:
  public String toString()

Fields:
public static final BuilderCodec<FlatWorldGenProvider.Layer> CODEC
public int from
public int to
public String environment
public String blockType
public int environmentId
public int blockId
