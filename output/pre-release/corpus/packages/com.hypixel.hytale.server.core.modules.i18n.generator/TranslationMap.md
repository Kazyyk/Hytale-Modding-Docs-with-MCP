# TranslationMap

Type: class | Package: com.hypixel.hytale.server.core.modules.i18n.generator

public class TranslationMap

Utility type in the `generator` subsystem.

## Accessors

- get(String key) | String | Accessor method.

## Methods

- put(String key, String value) | void | Instance method.
- removeKeys(Collection<? extends String> keys) | void | Instance method.
- size() | int | Instance method.
- putAbsentKeys(TranslationMap other) | void | Instance method.
- sortByKeyBeforeFirstDot() | void | Instance method.
- asMap() | Map<String, String> | Instance method.

Complete API:
  public String get(String key)
  public void put(String key, String value)
  public void removeKeys(Collection<? extends String> keys)
  public int size()
  public void putAbsentKeys(TranslationMap other)
  public void sortByKeyBeforeFirstDot()
  public Map<String,String> asMap()

Fields:
private LinkedHashMap<String,String> map
