---
title: "UICommandBuilder"
kind: "class"
package: "com.hypixel.hytale.server.core.ui.builder"
fqcn: "com.hypixel.hytale.server.core.ui.builder.UICommandBuilder"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "ui"
---

**Package:** `com.hypixel.hytale.server.core.ui.builder`

```java
public class UICommandBuilder
```

Fluent builder for constructing sequences of `CustomUICommand` packets sent to the client to manipulate custom UI documents. Supports DOM-like operations: clear, remove, append, insert-before, and setting values of various types (string, boolean, int, float, double, `Message`, arrays, lists, and codec-registered objects). Registered codec types include `Area`, `ItemGridSlot`, `ItemStack`, `LocalizableString`, `PatchStyle`, `DropdownEntryInfo`, and `Anchor`.

## Fields

| Field | Type | Description |
|---|---|---|
| `EMPTY_COMMAND_ARRAY` | `CustomUICommand[]` | Empty array constant for no-op command lists. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `clear(String selector)` | `UICommandBuilder` | Appends a Clear command for the given selector. |
| `remove(String selector)` | `UICommandBuilder` | Appends a Remove command. |
| `append(String documentPath)` | `UICommandBuilder` | Appends an Append command (no selector). |
| `append(String selector, String documentPath)` | `UICommandBuilder` | Appends an Append command under the given selector. |
| `appendInline(String selector, String document)` | `UICommandBuilder` | Appends inline document content. |
| `insertBefore(String selector, String documentPath)` | `UICommandBuilder` | Inserts a document before the selected element. |
| `insertBeforeInline(String selector, String document)` | `UICommandBuilder` | Inserts inline content before the selected element. |
| `set(String selector, @Nonnull Value<T> ref)` | `UICommandBuilder` | Sets a value reference (must not have a direct value). |
| `setNull(String selector)` | `UICommandBuilder` | Sets the selected element to null. |
| `set(String selector, @Nonnull String str)` | `UICommandBuilder` | Sets a string value. |
| `set(String selector, @Nonnull Message message)` | `UICommandBuilder` | Sets a `Message` value. |
| `set(String selector, boolean b)` | `UICommandBuilder` | Sets a boolean value. |
| `set(String selector, float n)` | `UICommandBuilder` | Sets a float value. |
| `set(String selector, int n)` | `UICommandBuilder` | Sets an integer value. |
| `set(String selector, double n)` | `UICommandBuilder` | Sets a double value. |
| `setObject(String selector, @Nonnull Object data)` | `UICommandBuilder` | Sets a value using a registered codec. |
| `set(String selector, @Nonnull T[] data)` | `UICommandBuilder` | Sets an array value using registered codecs. |
| `set(String selector, @Nonnull List<T> data)` | `UICommandBuilder` | Sets a list value using registered codecs. |
| `getCommands()` | `CustomUICommand[]` | Returns the built command array. |
