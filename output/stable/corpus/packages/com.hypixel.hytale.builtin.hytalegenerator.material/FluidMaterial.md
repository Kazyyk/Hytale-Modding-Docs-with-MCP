# FluidMaterial

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.material

public class FluidMaterial

## Fields

- @Nonnull private final MaterialCache materialCache
- public final int fluidId
- public final byte fluidLevel

## Constructors

- FluidMaterial(@Nonnull MaterialCache materialCache, int fluidId, byte fluidLevel)

## Methods

- @Nonnull public MaterialCache getVoxelCache()
- @Override public final boolean equals(Object o)
- @Override public int hashCode()
- public static int contentHash(int blockId, byte fluidLevel)
- @Nonnull @Override public String toString()

Also in this package: Hash, Material, MaterialCache, SolidMaterial

Complete API:
  public MaterialCache getVoxelCache()
  public final boolean equals(Object o)
  public int hashCode()
  public static int contentHash(int blockId, byte fluidLevel)
  public String toString()

Fields:
private final MaterialCache materialCache
public final int fluidId
public final byte fluidLevel
