# Material

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.material

public final class Material

## Fields

- @Nonnull private final SolidMaterial solid
- @Nonnull private final FluidMaterial fluid
- private Material.Hash hashCode
- private Material.Hash materialIdsHash

## Constructors

- public Material(@Nonnull SolidMaterial solid, @Nonnull FluidMaterial fluid)

## Methods

- @Override public boolean equals(Object o)
- @Override public int hashCode()
- public int hashMaterialIds()
- public static int hashCode(@Nonnull SolidMaterial solid, @Nonnull FluidMaterial fluid)
- public static int hashMaterialIds(@Nonnull SolidMaterial solid, @Nonnull FluidMaterial fluid)
- @Nonnull public SolidMaterial solid()
- @Nonnull public FluidMaterial fluid()
- @Nonnull @Override public String toString()

## Inner Types

- `Material.Hash`

Also in this package: FluidMaterial, Hash, MaterialCache, SolidMaterial

Complete API:
  public boolean equals(Object o)
  public int hashCode()
  public int hashMaterialIds()
  public static int hashCode(SolidMaterial solid, FluidMaterial fluid)
  public static int hashMaterialIds(SolidMaterial solid, FluidMaterial fluid)
  public SolidMaterial solid()
  public FluidMaterial fluid()
  public String toString()

Fields:
private final SolidMaterial solid
private final FluidMaterial fluid
private Material.Hash hashCode
private Material.Hash materialIdsHash
