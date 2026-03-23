# SimpleBiomeType

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.biome | Implements: BiomeType

public class SimpleBiomeType implements BiomeType

## Fields

- private final Density terrainDensity
- private final MaterialProvider<Material> materialProvider
- private final List<PropField> propFields
- private final EnvironmentProvider environmentProvider
- private final TintProvider tintProvider
- private final String biomeName

## Methods

- public void addPropFieldTo(PropField propField)
- @Override public MaterialProvider<Material> getMaterialProvider()
- @Nonnull @Override public Density getTerrainDensity()
- @Override public String getBiomeName()
- @Override public List<PropField> getPropFields()
- @Override public EnvironmentProvider getEnvironmentProvider()
- @Override public TintProvider getTintProvider()
- @Override public List<Assignments> getAllPropDistributions()

Also in this package: Biome, BiomeType, EnvironmentSource, MaterialSource, PropsSource, SimpleBiome, TintSource

Complete API:
  public void addPropFieldTo(PropField propField)
  public MaterialProvider<Material> getMaterialProvider()
  public Density getTerrainDensity()
  public String getBiomeName()
  public List<PropField> getPropFields()
  public EnvironmentProvider getEnvironmentProvider()
  public TintProvider getTintProvider()
  public List<Assignments> getAllPropDistributions()

Fields:
private final Density terrainDensity
private final MaterialProvider<Material> materialProvider
private final List<PropField> propFields
private final EnvironmentProvider environmentProvider
private final TintProvider tintProvider
private final String biomeName
