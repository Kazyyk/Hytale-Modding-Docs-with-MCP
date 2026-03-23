# ModConfig

Type: class | Package: com.hypixel.hytale.server.core.config

public class ModConfig

Configuration class for Mod settings.

## Fields

- @Nullable private Boolean enabled
- @Nullable private SemverRange requiredVersion

## Methods

- @Nullable public Boolean getEnabled()
- public void setEnabled(@Nonnull Boolean enabled)
- @Nullable public SemverRange getRequiredVersion()
- public void setRequiredVersion(@Nonnull SemverRange requiredVersion)

Also in this package: AutoApplyMode, BackupConfig, RateLimitConfig, UpdateConfig

Complete API:
  public Boolean getEnabled()
  public void setEnabled(Boolean enabled)
  public SemverRange getRequiredVersion()
  public void setRequiredVersion(SemverRange requiredVersion)

Fields:
public static final BuilderCodec<ModConfig> CODEC
private Boolean enabled
private SemverRange requiredVersion
