---
title: "AssetEditorRequestDataSetEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorRequestDataSetEvent"
api_surface: false
extends: null
implements: ["IAsyncEvent"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "event"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.event`

```java
public class AssetEditorRequestDataSetEvent implements IAsyncEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `EditorClient` | `editorClient` |
| `private final` | `String` | `dataSet` |
| `private` | `String[]` | `results` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getDataSet()` |
| `public` | `EditorClient` | `getEditorClient()` |
| `public` | `String[]` | `getResults()` |
| `public` | `void` | `setResults(String[] results)` |
| `@Nonnull @Override public` | `String` | `toString()` |
