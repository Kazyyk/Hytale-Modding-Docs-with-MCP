# UpdateConfig

Type: class | Package: com.hypixel.hytale.server.core.config

public class UpdateConfig

Configuration class for Update settings.

## Constants

- public static final int DEFAULT_CHECK_INTERVAL_SECONDS

## Fields

- private Boolean enabled
- private Integer checkIntervalSeconds
- private Boolean notifyPlayersOnAvailable
- private String patchline
- private Boolean runBackupBeforeUpdate
- private Boolean backupConfigBeforeUpdate
- private UpdateConfig.AutoApplyMode autoApplyMode
- private Integer autoApplyDelayMinutes

## Methods

- public UpdateConfig()
- public UpdateConfig(@Nonnull HytaleServerConfig hytaleServerConfig)
- public void setHytaleServerConfig(@Nonnull HytaleServerConfig hytaleServerConfig)
- public boolean isEnabled()
- public void setEnabled(boolean enabled)
- public int getCheckIntervalSeconds()
- public void setCheckIntervalSeconds(int checkIntervalSeconds)
- public boolean isNotifyPlayersOnAvailable()
- public void setNotifyPlayersOnAvailable(boolean notifyPlayersOnAvailable)
- @Nullable public String getPatchline()
- public void setPatchline(@Nullable String patchline)
- public boolean isRunBackupBeforeUpdate()
- public void setRunBackupBeforeUpdate(boolean runBackupBeforeUpdate)
- public boolean isBackupConfigBeforeUpdate()
- public void setBackupConfigBeforeUpdate(boolean backupConfigBeforeUpdate)
- @Nonnull public UpdateConfig.AutoApplyMode getAutoApplyMode()
- public void setAutoApplyMode(@Nonnull UpdateConfig.AutoApplyMode autoApplyMode)
- public int getAutoApplyDelayMinutes()
- public void setAutoApplyDelayMinutes(int autoApplyDelayMinutes)

Also in this package: AutoApplyMode, BackupConfig, ModConfig, RateLimitConfig, ServerWorldMapConfig, WorldMapConfig, WorldWorldMapConfig

Complete API:
  public void setHytaleServerConfig(HytaleServerConfig hytaleServerConfig)
  public boolean isEnabled()
  public void setEnabled(boolean enabled)
  public int getCheckIntervalSeconds()
  public void setCheckIntervalSeconds(int checkIntervalSeconds)
  public boolean isNotifyPlayersOnAvailable()
  public void setNotifyPlayersOnAvailable(boolean notifyPlayersOnAvailable)
  public String getPatchline()
  public void setPatchline(String patchline)
  public boolean isRunBackupBeforeUpdate()
  public void setRunBackupBeforeUpdate(boolean runBackupBeforeUpdate)
  public boolean isBackupConfigBeforeUpdate()
  public void setBackupConfigBeforeUpdate(boolean backupConfigBeforeUpdate)
  public UpdateConfig.AutoApplyMode getAutoApplyMode()
  public void setAutoApplyMode(UpdateConfig.AutoApplyMode autoApplyMode)
  public int getAutoApplyDelayMinutes()
  public void setAutoApplyDelayMinutes(int autoApplyDelayMinutes)

Fields:
public static final int DEFAULT_CHECK_INTERVAL_SECONDS
public static final Codec<UpdateConfig> CODEC
private Boolean enabled
private Integer checkIntervalSeconds
private Boolean notifyPlayersOnAvailable
private String patchline
private Boolean runBackupBeforeUpdate
private Boolean backupConfigBeforeUpdate
private UpdateConfig.AutoApplyMode autoApplyMode
private Integer autoApplyDelayMinutes
transient HytaleServerConfig hytaleServerConfig
