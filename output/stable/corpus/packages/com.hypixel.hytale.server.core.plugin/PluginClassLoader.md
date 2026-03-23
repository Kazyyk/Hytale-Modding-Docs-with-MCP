# PluginClassLoader

Type: class | Package: com.hypixel.hytale.server.core.plugin | Extends: URLClassLoader

public class PluginClassLoader extends URLClassLoader

Custom class loader for Java plugins. Implements a delegation chain: server classes first, then the plugin's own JAR, then a bridge loader that searches other loaded plugins. Supports parallel class loading.

## Methods

- public boolean isInServerClassPath()
- @Nonnull public Class<?> loadLocalClass(@Nonnull String name)
- public static boolean isFromThirdPartyPlugin(@Nullable Throwable throwable)

Also in this package: JavaPlugin, JavaPluginInit, MissingPluginDependencyException, PluginBase, PluginBridgeClassLoader, PluginInit, PluginListPageManager, PluginManager, PluginState, PluginType, SessionSettings

Complete API:
  public boolean isInServerClassPath()
  void setPlugin(JavaPlugin plugin)
  protected Class<?> loadClass(String name, boolean resolve)
  private Class<?> loadClass0(String name, boolean useBridge)
  public Class<?> loadLocalClass(String name)
  public URL getResource(String name)
  public Enumeration<URL> getResources(String name)
  public static boolean isFromThirdPartyPlugin(Throwable throwable)

Fields:
private final PluginManager pluginManager
private final boolean inServerClassPath
private JavaPlugin plugin
