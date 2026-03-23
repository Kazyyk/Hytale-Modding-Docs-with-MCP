# BackupConfig

Type: class | Package: com.hypixel.hytale.server.core.config

public class BackupConfig

Configuration class for Backup settings.

## Constants

- public static final int DEFAULT_FREQUENCY_MINUTES
- public static final int DEFAULT_MAX_COUNT
- public static final int DEFAULT_ARCHIVE_MAX_COUNT

## Fields

- @Nullable private Boolean enabled
- @Nullable private Integer frequencyMinutes
- @Nullable private String directory
- @Nullable private Integer maxCount
- @Nullable private Integer archiveMaxCount

## Methods

- public BackupConfig()
- public BackupConfig(@Nonnull HytaleServerConfig hytaleServerConfig)
- public void setHytaleServerConfig(@Nonnull HytaleServerConfig hytaleServerConfig)
- public boolean isEnabled()
- @Nullable public Boolean getEnabledConfig()
- public void setEnabled(boolean enabled)
- public int getFrequencyMinutes()
- @Nullable public Integer getFrequencyMinutesConfig()
- public void setFrequencyMinutes(int frequencyMinutes)
- @Nullable public Path getDirectory()
- @Nullable public String getDirectoryConfig()
- public void setDirectory(@Nullable String directory)
- public int getMaxCount()
- @Nullable public Integer getMaxCountConfig()
- public void setMaxCount(int maxCount)
- public int getArchiveMaxCount()
- @Nullable public Integer getArchiveMaxCountConfig()
- public void setArchiveMaxCount(int archiveMaxCount)
- public boolean isConfigured()
