# FileBrowserConfig.RootEntry

Type: record | Package: com.hypixel.hytale.server.core.ui.browser

public record RootEntry(@Nonnull LocalizableString displayName, @Nonnull Path path)

A root directory entry for the file browser, pairing a localizable display name with a filesystem path.

## Constructors

- public RootEntry(@Nonnull String displayName, @Nonnull Path path)
- public RootEntry(@Nonnull LocalizableString displayName, @Nonnull Path path)
