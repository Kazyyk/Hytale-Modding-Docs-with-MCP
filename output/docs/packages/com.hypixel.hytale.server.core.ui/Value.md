---
title: "Value"
kind: "class"
package: "com.hypixel.hytale.server.core.ui"
fqcn: "com.hypixel.hytale.server.core.ui.Value"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "ui"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.ui`

```java
public class Value<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `T` | `value` |
| `private` | `String` | `documentPath` |
| `private` | `String` | `valueName` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `Value(String documentPath, String valueName)` |
| `private` | `Value(T value)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `T` | `getValue()` |
| `public` | `String` | `getDocumentPath()` |
| `public` | `String` | `getValueName()` |
| `@Nonnull public static` | `<T> Value<T>` | `ref(String document, String value)` |
| `@Nonnull public static` | `<T> Value<T>` | `of(T value)` |
