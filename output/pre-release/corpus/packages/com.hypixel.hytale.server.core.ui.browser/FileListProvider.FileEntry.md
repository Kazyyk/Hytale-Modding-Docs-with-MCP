# FileListProvider.FileEntry

Type: record | Package: com.hypixel.hytale.server.core.ui.browser

public record FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory, boolean isTerminal, int matchScore)

Represents a file or directory entry in the file browser listing. The `isTerminal` flag indicates directories that should not be navigated into (treated as selectable items). The `matchScore` is used for ranking search results.

## Constructors

- public FileEntry(@Nonnull String name, boolean isDirectory)
- public FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory)
- public FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory, boolean isTerminal)
- public FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory, boolean isTerminal, int matchScore)
