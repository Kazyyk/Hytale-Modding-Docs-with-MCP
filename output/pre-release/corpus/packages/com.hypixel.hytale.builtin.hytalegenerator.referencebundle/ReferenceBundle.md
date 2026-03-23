# ReferenceBundle

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.referencebundle

public class ReferenceBundle

Utility type in the `referencebundle` subsystem.

## Accessors

- get(String name, Class<T> type) | T | Accessor method.

## Methods

- put(String name, T reference, Class<T> type) | void | Instance method.

Complete API:
  public void put(String name, T reference, Class<T> type)
  public T get(String name, Class<T> type)

Fields:
private final Map<String,Object> dataLayerMap
private final Map<String,Class<?>> layerTypeMap
