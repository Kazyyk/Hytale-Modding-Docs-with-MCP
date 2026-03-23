# FileListProvider

Type: interface | Package: com.hypixel.hytale.server.core.ui.browser

@FunctionalInterface
public interface FileListProvider

Functional interface for providing custom file listings to the server file browser. Implementations return a list of file entries for a given directory path and search query.

## Methods

- public List<FileListProvider.FileEntry> getFiles(@Nonnull Path var1, @Nonnull String var2)

## Inner Types

- FileListProvider.FileEntry -- record describing a file or directory entry

Known implementors: AssetPrefabFileProvider, ScriptedBrushListProvider

Also in this package: AssetPackSearchResult, Builder, FileBrowserConfig, FileBrowserEventData, FileEntry, RootEntry, ServerFileBrowser

Complete API:
  List<FileListProvider.FileEntry> getFiles(Path var1, String var2)
