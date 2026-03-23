# Material

Type: class | Package: com.hypixel.hytale.builtin.buildertools.utils

public final class Material

## Constants

- public static final Material EMPTY

## Fields

- private final int blockId
- private final int fluidId
- private final byte fluidLevel
- private final int rotation

## Methods

- private Material(int blockId, int fluidId, byte fluidLevel, int rotation)
- public static Material block(int blockId)
- public static Material block(int blockId, int rotation)
- public static Material fluid(int fluidId, byte fluidLevel)
- public static Material fromKey(@Nonnull String key)
- public boolean isFluid()
- public boolean isBlock()
- public boolean isEmpty()
- public int getBlockId()
- public int getFluidId()
- public byte getFluidLevel()
- public int getRotation()
- public boolean hasRotation()
- public String toString()
- public boolean equals(Object obj)
- public int hashCode()
- public static Material fromPattern(@Nonnull BlockPattern pattern, @Nonnull Random random)

Also in this package: BlockSelectionLoader, DistinctCollector, FluidInfo, FluidPatternHelper, PasteToolUtil, RecursivePrefabLoader

Complete API:
  public static Material block(int blockId)
  public static Material block(int blockId, int rotation)
  public static Material fluid(int fluidId, byte fluidLevel)
  public static Material full(int blockId, int rotation, int support, int filler, Holder<ChunkStore> holder)
  public static Material full(int blockId, int rotation, int support, int filler, Holder<ChunkStore> holder, int fluidId, byte fluidLevel)
  public static Material fromKey(String key)
  public boolean isFluid()
  public boolean isBlock()
  public boolean isEmpty()
  public int getBlockId()
  public int getFluidId()
  public byte getFluidLevel()
  public int getRotation()
  public boolean hasRotation()
  public int getSupport()
  public int getFiller()
  public Holder<ChunkStore> getHolder()
  public String toString()
  public boolean equals(Object obj)
  public int hashCode()
  public static Material fromPattern(BlockPattern pattern, Random random)

Fields:
public static final Material EMPTY
private final int blockId
private final int fluidId
private final byte fluidLevel
private final int rotation
private final int support
private final int filler
private final Holder<ChunkStore> holder
