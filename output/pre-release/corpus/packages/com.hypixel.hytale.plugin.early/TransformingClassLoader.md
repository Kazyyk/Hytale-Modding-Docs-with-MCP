# TransformingClassLoader

Type: class | Package: com.hypixel.hytale.plugin.early | Extends: URLClassLoader

public final class TransformingClassLoader extends URLClassLoader

Concrete implementation extending `URLClassLoader`.

## Fields

- transformers | List<ClassTransformer> | final List<ClassTransformer> field.
- appClassLoader | ClassLoader | final ClassLoader field.

## Constructors

- TransformingClassLoader(@Nonnull URL[] urls, @Nonnull List<ClassTransformer> transformers, ClassLoader parent, ClassLoader appClassLoader) | Creates a new TransformingClassLoader instance.

## Methods

- loadClass(String name, boolean resolve) | Class<?> | protected method.
- transformAndDefine(String name, String internalName, byte[] classBytes, URL resource) | Class<?> | private method.
- getCodeSourceUrl(URL resource, String internalName) | URL | static private method.
- isPreloadedClass(@Nonnull String name) | boolean | static private method.
- isSecureClass(@Nonnull String name) | boolean | static private method.

Also in this package: ClassTransformer, EarlyPluginLoader

Complete API:
  protected Class<?> loadClass(String name, boolean resolve)
  private Class<?> transformAndDefine(String name, String internalName, byte[] classBytes, URL resource)
  private static URL getCodeSourceUrl(URL resource, String internalName)
  private static boolean isPreloadedClass(String name)
  private static boolean isSecureClass(String name)

Fields:
private static final Set<String> SECURE_PACKAGE_PREFIXES
private final List<ClassTransformer> transformers
private final ClassLoader appClassLoader
