---
title: "GenerateDefaultLanguageEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.modules.i18n.event"
fqcn: "com.hypixel.hytale.server.core.modules.i18n.event.GenerateDefaultLanguageEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - i18n
  - asset
---

> Package: `com.hypixel.hytale.server.core.modules.i18n.event`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched during default language generation for the i18n system. Listeners can contribute translation files by calling `putTranslationFile()`.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `translationFiles` | `ConcurrentHashMap<String,TranslationMap>` | -- | No | No |

- **translationFiles** -- The concurrent map of translation file names to translation maps. Accessible via `putTranslationFile(String, TranslationMap)`.

## Methods

### `putTranslationFile(String filename, TranslationMap translations)`

Adds a translation file to the default language generation. The filename and translations must not be null.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

```java
getEventRegistry().register(GenerateDefaultLanguageEvent.class, event -> {
    TranslationMap myTranslations = new TranslationMap();
    myTranslations.put("myplugin.greeting", "Hello, World!");
    event.putTranslationFile("myplugin.lang", myTranslations);
});
```

## Related Events

- [`MessagesUpdated`](./MessagesUpdated.md) -- Fired when translation messages are updated at runtime.
