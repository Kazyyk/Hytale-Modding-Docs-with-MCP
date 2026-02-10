---
title: "JSON Asset Schemas"
kind: "overview"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - "schemas"
  - "json"
  - "assets"
  - "codec"
---

> Codec infrastructure: `com.hypixel.hytale.codec`

Hytale uses a data-driven asset system where game content (blocks, items, recipes, etc.) is defined in JSON files within asset packs. The serialization framework is built on a declarative `BuilderCodec` pattern that generates both the JSON parser and the JSON Schema simultaneously.

## The BuilderCodec Pattern

Asset types define their JSON schema declaratively through `BuilderCodec`:

- Fields are declared as `KeyedCodec` entries mapping a JSON key to getter/setter pairs
- JSON keys must start with an uppercase character (enforced by the framework)
- `BuilderCodec` supports inheritance via `appendInherited()` — asset packs can extend base game assets
- Versioning is built-in: fields can have `minVersion`/`maxVersion` for backwards compatibility
- Validation is per-field and per-object via `BiConsumer<T, ValidationResults>`
- The same codec generates both the runtime parser and JSON Schema for editor tooling

## Plugin Configuration

Plugins define their own JSON configuration using `BuilderCodec`:

```java
public class MyPlugin extends PluginBase {
    private static final BuilderCodec<MyConfig> CONFIG_CODEC = ...;
    private final Config<MyConfig> config;

    public MyPlugin(JavaPluginInit init) {
        super(init);
        this.config = withConfig(CONFIG_CODEC);  // Must be called before setup()
    }
}
```

`withConfig()` creates a `Config<T>` loaded from the plugin's data directory.

## Plugin Codec Registration

Plugins can register custom codecs to extend polymorphic type hierarchies:

### String-Keyed Codecs (CodecMapRegistry)

For type discriminators in JSON (e.g., `"Type": "Sword"`):

```java
getCodecRegistry(Item.CODEC_MAP).register("MyCustomItem", MyItem.class, myCodec);
```

### Class-Keyed Codecs (MapKeyMapRegistry)

For `Class`-based dispatch (e.g., extending abstract component types):

```java
getCodecRegistry(SomeMapKeyCodec).register(MyComponent.class, "myplugin:mycomponent", myCodec);
```

Both registry types support live propagation — newly registered codecs are immediately available to all existing codec consumers.

## Documented Schemas

| Schema | Asset Type | Fields | Description |
|--------|-----------|--------|-------------|
| [Block](block.md) | `BlockType` | 40+ | Block type definition (rendering, physics, interactions) |
| [Item](item.md) | `Item` | 50+ | Item definition (UI, gameplay, crafting) |
| [Crafting Recipe](crafting-recipe.md) | `CraftingRecipe` | 8 | Crafting recipe definition |

## Key Codec Types

| Type | Description |
|------|-------------|
| `Codec<T>` | Root interface — encodes/decodes T to/from BSON |
| `KeyedCodec<T>` | Named field: JSON key + `Codec<T>` pair |
| `BuilderCodec<T>` | Declarative builder for complex types |
| `StringCodecMapCodec<T, C>` | String-keyed polymorphic dispatch |
| `MapKeyMapCodec<V>` | Class-keyed polymorphic dispatch |
| `SchemaConvertable<T>` | Interface for JSON Schema generation |

## Primitive Codecs

`Codec` provides static constants for primitive types:

`STRING`, `BOOLEAN`, `DOUBLE`, `FLOAT`, `BYTE`, `SHORT`, `INTEGER`, `LONG`

Plus array codecs: `IntArrayCodec`, `LongArrayCodec`, `FloatArrayCodec`, `DoubleArrayCodec`, `ArrayCodec`, `UUIDBinaryCodec`

## Related

- **[Registries](../api/registries/index.md)** — Registry system including codec registration
- **[PluginBase](../api/classes/PluginBase.md)** — Plugin configuration via `withConfig()`
