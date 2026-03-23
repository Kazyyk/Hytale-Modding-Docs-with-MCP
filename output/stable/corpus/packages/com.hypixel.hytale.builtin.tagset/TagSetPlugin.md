# TagSetPlugin

Type: class | Package: com.hypixel.hytale.builtin.tagset | Extends: JavaPlugin

public class TagSetPlugin extends JavaPlugin

Plugin that registers assets, interactions for the builtin subsystem.

## Fields

- instance | TagSetPlugin | Static TagSetPlugin field.

## Constructors

- TagSetPlugin(@Nonnull JavaPluginInit init) | Creates a new TagSetPlugin instance.

## Methods

- get() | TagSetPlugin | static public method.
- setup() | void | protected method.
- registerTagSetType(Class<T> clazz) | void | public method.
- get(Class<T> clazz) | TagSetPlugin.TagSetLookup | static public method.

Also in this package: TagSet, TagSetLookup, TagSetLookupTable

Complete API:
  public static TagSetPlugin get()
  protected void setup()
  public void registerTagSetType(Class<T> clazz)
  public static TagSetPlugin.TagSetLookup get(Class<T> clazz)

Fields:
private static TagSetPlugin instance
private final Map<Class<? extends TagSet>,TagSetPlugin.TagSetLookup> lookups
