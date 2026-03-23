---
title: "ManifestUtil"
kind: "class"
package: "com.hypixel.hytale.common.util.java"
fqcn: "com.hypixel.hytale.common.util.java.ManifestUtil"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "common"
  - "util"
  - "java"
  - "class"
---

**Package:** `com.hypixel.hytale.common.util.java`

```java
public class ManifestUtil
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `VENDOR_ID_PROPERTY` |
| `public static final` | `String` | `VERSION_PROPERTY` |
| `public static final` | `String` | `REVISION_ID_PROPERTY` |
| `public static final` | `String` | `PATCHLINE_PROPERTY` |
| `private static final` | `CachedSupplier<Manifest>` | `MANIFEST` |
| `private static final` | `CachedSupplier<String>` | `IMPLEMENTATION_VERSION` |
| `private static final` | `CachedSupplier<String>` | `IMPLEMENTATION_REVISION_ID` |
| `private static final` | `CachedSupplier<String>` | `IMPLEMENTATION_PATCHLINE` |
| `private static final` | `CachedSupplier<String>` | `VERSION` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `boolean` | `isJar()` |
| `@Nullable public static` | `Manifest` | `getManifest()` |
| `@Nullable public static` | `String` | `getImplementationVersion()` |
| `@Nullable public static` | `String` | `getVersion()` |
| `@Nullable public static` | `String` | `getImplementationRevisionId()` |
| `@Nullable public static` | `String` | `getPatchline()` |
