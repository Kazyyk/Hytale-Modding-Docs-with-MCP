# PendingLoadJavaPlugin

Type: class | Package: com.hypixel.hytale.server.core.plugin.pending | Extends: PendingLoadPlugin

public class PendingLoadJavaPlugin extends PendingLoadPlugin

## Fields

- private static final HytaleLogger LOGGER
- @Nonnull private final PluginClassLoader urlClassLoader

## Constructors

- public PendingLoadJavaPlugin(@Nullable Path path, @Nonnull PluginManifest manifest, @Nonnull PluginClassLoader urlClassLoader)

## Methods

- @Nonnull @Override public PendingLoadPlugin createSubPendingLoadPlugin(@Nonnull PluginManifest manifest)
- @Override public boolean isInServerClassPath()
- @Nonnull public JavaPlugin load()
- @Nonnull @Override public String toString()

Also in this package: EntryNode, PendingLoadPlugin

Complete API:
  public PendingLoadPlugin createSubPendingLoadPlugin(PluginManifest manifest)
  public boolean isInServerClassPath()
  public JavaPlugin load()
  public String toString()

Fields:
private static final HytaleLogger LOGGER
private final PluginClassLoader urlClassLoader
