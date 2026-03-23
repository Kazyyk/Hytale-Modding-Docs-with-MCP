---
title: "StringListHelpers"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.util"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.util.StringListHelpers"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "asset"
  - "builder"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder.util`

```java
public class StringListHelpers
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `Pattern` | `listSplitter` |
| `private static` | `Pattern` | `listListSplitter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `String` | `stringListToString(Collection<String> list)` |
| `@Nonnull public static` | `List<String>` | `splitToStringList(String string, Function<String,String> mapper)` |
| `public static` | `void` | `splitToStringList(String string, Function<String,String> mapper, Collection<String> result)` |
| `@Nonnull public static` | `String` | `stringListListToString(Collection<Collection<String>> list)` |
| `@Nonnull public static` | `List<List<String>>` | `splitToStringListList(String string, Function<String,String> mapper)` |
| `public static` | `void` | `splitToStringListList(String string, Function<String,String> mapper, Collection<Collection<String>> result, Supplier<Collection<String>> supplier)` |
| `@Nonnull public static` | `Set<String>` | `stringListToStringSet(List<String> list)` |
| `@Nonnull public static` | `Set<String>` | `splitToStringSet(String input)` |
| `@Nonnull public static` | `Set<T>` | `splitToStringSet(String input, Function<String,T> transform)` |
| `@Nonnull public static` | `List<Set<String>>` | `stringListListToStringSetList(List<List<String>> group)` |
