---
title: "com.hypixel.hytale.codec.schema.config"
package: "com.hypixel.hytale.codec.schema.config"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
---

**Package:** `com.hypixel.hytale.codec.schema.config`

Codec schema configuration types implementing a JSON Schema-compatible system with Hytale-specific extensions. The base `Schema` class represents a JSON Schema node and supports standard keywords (`$ref`, `anyOf`, `oneOf`, `allOf`, `if`/`then`/`else`, etc.) plus Hytale extensions for asset editor integration, inheritance, and UI configuration. Type-specific subclasses add validation keywords for each JSON type.

## Schema Types

| Type | API | Description |
|---|---|---|
| [Schema](Schema.md) | Yes | Base schema class with all standard and Hytale-specific keywords. |
| [ArraySchema](ArraySchema.md) | No | Array type schema with `items`, `minItems`, `maxItems`, `uniqueItems`. |
| [BooleanSchema](BooleanSchema.md) | No | Boolean type schema with `default`. |
| [IntegerSchema](IntegerSchema.md) | No | Integer type schema with range bounds, `enum`, `const`, `default`. |
| [NullSchema](NullSchema.md) | No | Null type schema (no additional keywords). |
| [NumberSchema](NumberSchema.md) | No | Number type schema with range bounds, `enum`, `const`, `default`. |
| [ObjectSchema](ObjectSchema.md) | Yes | Object type schema with `properties`, `additionalProperties`, `propertyNames`. |
| [StringSchema](StringSchema.md) | Yes | String type schema with `pattern`, `enum`, `const`, length bounds, and asset refs. |

## Inner Types

| Type | Parent | API | Description |
|---|---|---|---|
| [Schema.HytaleMetadata](Schema.HytaleMetadata.md) | Schema | Yes | Hytale-specific metadata for UI editor, paths, and caching. |
| [Schema.InheritSettings](Schema.InheritSettings.md) | Schema | Yes | Parent schema inheritance configuration. |
| [Schema.SchemaTypeField](Schema.SchemaTypeField.md) | Schema | Yes | Type discriminator field configuration. |
| [StringSchema.CommonAsset](StringSchema.CommonAsset.md) | StringSchema | Yes | Common asset file reference configuration. |
