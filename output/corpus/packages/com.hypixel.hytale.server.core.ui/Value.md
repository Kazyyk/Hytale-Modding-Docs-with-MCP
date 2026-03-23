# Value

Type: class | Package: com.hypixel.hytale.server.core.ui

public class Value<T>

## Fields

- private T value
- private String documentPath
- private String valueName

## Constructors

- private Value(String documentPath, String valueName)
- private Value(T value)

## Methods

- public T getValue()
- public String getDocumentPath()
- public String getValueName()
- @Nonnull public static <T> Value<T> ref(String document, String value)
- @Nonnull public static <T> Value<T> of(T value)
