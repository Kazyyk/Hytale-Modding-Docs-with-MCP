---
title: "FileBrowserEventData"
kind: "class"
package: "com.hypixel.hytale.server.core.ui.browser"
fqcn: "com.hypixel.hytale.server.core.ui.browser.FileBrowserEventData"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "ui"
  - "browser"
  - "event"
---

**Package:** `com.hypixel.hytale.server.core.ui.browser`

```java
public class FileBrowserEventData
```

Codec-backed event data for file browser UI interactions. Carries optional file path, root selector value, search query, search result, and browse request flag.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `KEY_FILE` |
| `public static final` | `String` | `KEY_ROOT` |
| `public static final` | `String` | `KEY_SEARCH_QUERY` |
| `public static final` | `String` | `KEY_SEARCH_RESULT` |
| `public static final` | `String` | `KEY_BROWSE` |
| `public static final` | `BuilderCodec<FileBrowserEventData>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getFile()` |
| `public` | `String` | `getRoot()` |
| `public` | `String` | `getSearchQuery()` |
| `public` | `String` | `getSearchResult()` |
| `public` | `boolean` | `isBrowseRequested()` |
| `public static` | `FileBrowserEventData` | `file(String file)` |
