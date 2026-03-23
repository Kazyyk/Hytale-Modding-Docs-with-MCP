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
