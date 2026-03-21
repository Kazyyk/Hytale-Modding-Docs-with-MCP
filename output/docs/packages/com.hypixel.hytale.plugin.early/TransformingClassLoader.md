---
title: "TransformingClassLoader"
kind: "class"
package: "com.hypixel.hytale.plugin.early"
fqcn: "com.hypixel.hytale.plugin.early.TransformingClassLoader"
api_surface: false
extends: "URLClassLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "plugin"
---

**Package:** `com.hypixel.hytale.plugin.early`

```java
public final class TransformingClassLoader extends URLClassLoader
```

Concrete implementation extending `URLClassLoader`.

## Fields

| Field | Type | Description |
|---|---|---|
| `transformers` | `List<ClassTransformer>` | final List<ClassTransformer> field. |
| `appClassLoader` | `ClassLoader` | final ClassLoader field. |

## Constructors

| Constructor | Description |
|---|---|
| `TransformingClassLoader(@Nonnull URL[] urls, @Nonnull List<ClassTransformer> transformers, ClassLoader parent, ClassLoader appClassLoader)` | Creates a new TransformingClassLoader instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `loadClass(String name, boolean resolve)` | `Class<?>` | protected method. |
| `transformAndDefine(String name, String internalName, byte[] classBytes, URL resource)` | `Class<?>` | private method. |
| `getCodeSourceUrl(URL resource, String internalName)` | `URL` | static private method. |
| `isPreloadedClass(@Nonnull String name)` | `boolean` | static private method. |
| `isSecureClass(@Nonnull String name)` | `boolean` | static private method. |
