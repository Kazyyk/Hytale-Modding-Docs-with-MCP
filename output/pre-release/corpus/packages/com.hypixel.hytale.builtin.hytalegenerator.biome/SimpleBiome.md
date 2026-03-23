# SimpleBiome

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.biome | Implements: Biome

public class SimpleBiome implements Biome

## Fields

- private final Density terrainDensity
- private final MaterialProvider<Material> materialProvider
- private final List<PropField> propFields
- private final EnvironmentProvider environmentProvider
- private final TintProvider tintProvider
- private final String biomeName

## Methods

- public void addPropFieldTo(PropField propField)
- @Nonnull @Override public MaterialProvider<Material> getMaterialProvider()
- @Nonnull @Override public Density getTerrainDensity()
- @Nonnull @Override public String getBiomeName()
- @Nonnull @Override public List<PropField> getPropFields()
- @Nonnull @Override public EnvironmentProvider getEnvironmentProvider()
- @Nonnull @Override public TintProvider getTintProvider()
- @Nonnull @Override public List<Assignments> getAllPropDistributions()

Also in this package: Biome, EnvironmentSource, MaterialSource, PropsSource, TintSource

Complete API:
  public void addPropFieldTo(PropRuntime propRuntime)
  public MaterialProvider<Material> getMaterialProvider()
  public Density getTerrainDensity()
  public void getRuntimesWithIndex(int runtimeIndex, Consumer<PropRuntime> out)
  public List<PropRuntime> getPropRuntimes()
  public EnvironmentProvider getEnvironmentProvider()
  public TintProvider getTintProvider()

Fields:
private final Density terrainDensity
private final MaterialProvider<Material> materialProvider
private final List<PropRuntime> propRuntimes
private final EnvironmentProvider environmentProvider
private final TintProvider tintProvider
private final String biomeName
