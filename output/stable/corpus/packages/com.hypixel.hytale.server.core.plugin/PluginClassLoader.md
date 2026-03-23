# PluginClassLoader

Type: class | Package: com.hypixel.hytale.server.core.plugin | Extends: URLClassLoader

public class PluginClassLoader extends URLClassLoader

Custom class loader for Java plugins. Implements a delegation chain: server classes first, then the plugin's own JAR, then a bridge loader that searches other loaded plugins. Supports parallel class loading.

## Methods

- public boolean isInServerClassPath()
- @Nonnull public Class<?> loadLocalClass(@Nonnull String name)
- public static boolean isFromThirdPartyPlugin(@Nullable Throwable throwable)
