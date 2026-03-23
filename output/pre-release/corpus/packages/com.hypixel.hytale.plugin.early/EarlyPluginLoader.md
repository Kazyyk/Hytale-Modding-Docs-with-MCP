# EarlyPluginLoader

Type: class | Package: com.hypixel.hytale.plugin.early

public final class EarlyPluginLoader

Class in the early subsystem.

## Fields

- pluginClassLoader | URLClassLoader | Static URLClassLoader field.

## Constructors

- EarlyPluginLoader() | Creates a new EarlyPluginLoader instance.

## Methods

- loadEarlyPlugins(@Nonnull String[] args) | void | static public method.
- parseEarlyPluginPaths(@Nonnull String[] args) | List<Path> | static private method.
- hasFlag(String[] args, String flag) | boolean | static private method.
- collectPluginJars(Path path, List<URL> urls) | void | static private method.
- hasTransformers() | boolean | static public method.
- getTransformers() | List<ClassTransformer> | static public method.
- getPluginClassLoader() | URLClassLoader | static public method.

Also in this package: ClassTransformer, TransformingClassLoader

Complete API:
  public static void loadEarlyPlugins(String[] args)
  private static List<Path> parseEarlyPluginPaths(String[] args)
  private static boolean hasFlag(String[] args, String flag)
  private static void collectPluginJars(Path path, List<URL> urls)
  public static boolean hasTransformers()
  public static List<ClassTransformer> getTransformers()
  public static URLClassLoader getPluginClassLoader()

Fields:
public static final Path EARLY_PLUGINS_PATH
private static final List<ClassTransformer> transformers
private static URLClassLoader pluginClassLoader
