---
title: "Schema"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.Schema"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "api"
---

**Package:** `com.hypixel.hytale.codec.schema.config`

```java
public class Schema
```

Base class for the Hytale JSON Schema configuration system. Represents a JSON Schema node with support for standard JSON Schema keywords (`$id`, `type`, `title`, `description`, `anyOf`, `oneOf`, `allOf`, `not`, `if`/`then`/`else`, `required`, `default`, `definitions`, `$ref`, `$data`) plus Hytale-specific extensions (`hytale`, `hytaleParent`, `hytaleSchemaTypeField`, `hytaleAssetRef`, `hytaleCustomAssetRef`, `doNotSuggest`). Uses a polymorphic `ObjectCodecMapCodec` discriminated on the `type` field.

## Static Fields

| Type | Name | Description |
|---|---|---|
| `ObjectCodecMapCodec<String, Schema>` | `CODEC` | Polymorphic codec for Schema, discriminated by `type`. |
| `ArrayCodec<Schema>` | `ARRAY_CODEC` | Array codec for Schema arrays. |
| `BuilderCodec<Schema>` | `BASE_CODEC` | Base builder codec with all standard and Hytale-specific fields. |

## Codec Properties (BASE_CODEC)

| Key | Type | Description |
|---|---|---|
| `$id` | `String` | Schema identifier. |
| `type` | `String[]` | JSON Schema type(s). |
| `title` | `String` | Display title. |
| `description` | `String` | Plain-text description. |
| `markdownDescription` | `String` | Markdown-formatted description. |
| `enumDescriptions` | `String[]` | Descriptions for enum values. |
| `markdownEnumDescriptions` | `String[]` | Markdown enum descriptions. |
| `anyOf` | `Schema[]` | anyOf composition. |
| `oneOf` | `Schema[]` | oneOf composition. |
| `allOf` | `Schema[]` | allOf composition. |
| `not` | `Schema` | not composition. |
| `if` | `Schema` | Conditional schema (if). |
| `then` | `Schema` | Conditional schema (then). |
| `else` | `Object` (Boolean or Schema) | Conditional schema (else). |
| `required` | `String[]` | Required property names. |
| `default` | `BsonDocument` | Default value. |
| `definitions` | `Map<String, Schema>` | Reusable schema definitions. |
| `$ref` | `String` | Reference to another schema. |
| `$data` | `String` | Data reference. |
| `doNotSuggest` | `Boolean` | Suppress from autocomplete suggestions. |
| `hytaleAssetRef` | `String` | Hytale asset reference. |
| `hytaleCustomAssetRef` | `String` | Hytale custom asset reference. |
| `hytaleParent` | [Schema.InheritSettings](Schema.InheritSettings.md) | Parent inheritance configuration. |
| `hytaleSchemaTypeField` | [Schema.SchemaTypeField](Schema.SchemaTypeField.md) | Type field discriminator configuration. |
| `hytale` | [Schema.HytaleMetadata](Schema.HytaleMetadata.md) | Hytale-specific metadata (UI editor, paths, features). |

## Static Methods

```java
@Nonnull
public static Schema ref(String file)
```

Creates a `$ref` schema.

```java
@Nonnull
public static Schema data(String file)
```

Creates a `$data` schema.

```java
@Nonnull
public static Schema anyOf(Schema... anyOf)
```

Creates an `anyOf` composition schema.

```java
@Nonnull
public static Schema not(Schema not)
```

Creates a `not` composition schema.

```java
public static void init()
```

Registers all built-in schema types (`null`, `string`, `number`, `integer`, `array`, `boolean`, `object`) with the codec.

## Methods

Getter and setter methods for all fields listed above.

```java
@Override
public boolean equals(@Nullable Object o)
```

```java
@Override
public int hashCode()
```

## Inner Classes

- [Schema.HytaleMetadata](Schema.HytaleMetadata.md) -- Hytale-specific metadata (UI editor, paths, caching, etc.)
- [Schema.InheritSettings](Schema.InheritSettings.md) -- parent schema inheritance configuration
- [Schema.SchemaTypeField](Schema.SchemaTypeField.md) -- type discriminator field configuration

## Subclasses

- [ArraySchema](ArraySchema.md)
- [BooleanSchema](BooleanSchema.md)
- [IntegerSchema](IntegerSchema.md)
- [NullSchema](NullSchema.md)
- [NumberSchema](NumberSchema.md)
- [ObjectSchema](ObjectSchema.md)
- [StringSchema](StringSchema.md)
