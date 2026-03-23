# DensityDelimitedEnvironmentProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.environmentproviders | Extends: EnvironmentProviderAsset

public class DensityDelimitedEnvironmentProviderAsset extends EnvironmentProviderAsset

Asset definition for DensityDelimitedEnvironmentProvider configuration data.

## Fields

- private DensityDelimitedEnvironmentProviderAsset.DelimiterAsset[] delimiterAssets
- private DensityAsset densityAsset

## Methods

- @Nonnull @Override public EnvironmentProvider build(@Nonnull EnvironmentProviderAsset.Argument argument)
- @Override public void cleanUp()

Also in this package: Argument, ConstantEnvironmentProviderAsset, DelimiterAsset, EnvironmentProviderAsset

Complete API:
  public EnvironmentProvider build(EnvironmentProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<DensityDelimitedEnvironmentProviderAsset> CODEC
private DensityDelimitedEnvironmentProviderAsset.DelimiterAsset[] delimiterAssets
private DensityAsset densityAsset
