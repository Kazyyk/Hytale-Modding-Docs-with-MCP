---
title: "SchemaConvertable"
kind: "interface"
package: "com.hypixel.hytale.codec.schema"
fqcn: "com.hypixel.hytale.codec.schema.SchemaConvertable"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "interface"
---

**Package:** `com.hypixel.hytale.codec.schema`

```java
public interface SchemaConvertable<T>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull` | `Schema` | `toSchema(SchemaContext var1)` |
| `@Nonnull default` | `Schema` | `toSchema(SchemaContext context, T def)` |
