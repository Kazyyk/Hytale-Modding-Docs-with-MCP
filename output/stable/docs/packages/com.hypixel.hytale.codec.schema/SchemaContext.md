---
title: "SchemaContext"
kind: "class"
package: "com.hypixel.hytale.codec.schema"
fqcn: "com.hypixel.hytale.codec.schema.SchemaContext"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.schema`

```java
public class SchemaContext
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Map<String,Schema>` | `definitions` |
| `private final` | `Map<String,Schema>` | `otherDefinitions` |
| `private final` | `Map<Object,String>` | `nameMap` |
| `private final` | `Object2IntMap<String>` | `nameCollisionCount` |
| `private final` | `Map<SchemaConvertable<?>,String>` | `fileReferences` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `addFileReference(String fileName, SchemaConvertable<?> codec)` |
| `@Nullable public` | `Schema` | `getFileReference(SchemaConvertable<?> codec)` |
| `@Nonnull public` | `Schema` | `refDefinition(SchemaConvertable<?> codec)` |
| `@Nonnull public` | `Schema` | `refDefinition(SchemaConvertable<T> convertable, T def)` |
| `@Nullable public` | `Schema` | `getRawDefinition(BuilderCodec<?> codec)` |
| `@Nullable public` | `Schema` | `getRawDefinition(NamedSchema namedSchema)` |
| `@Nonnull public` | `Map<String,Schema>` | `getDefinitions()` |
| `@Nonnull public` | `Map<String,Schema>` | `getOtherDefinitions()` |
| `private` | `String` | `resolveName(NamedSchema namedSchema)` |
| `@Nonnull private` | `String` | `resolveName(BuilderCodec<?> codec)` |
