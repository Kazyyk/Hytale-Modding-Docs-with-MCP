# SubTypeTypeAdapterFactory

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: null

public class SubTypeTypeAdapterFactory

Gson TypeAdapterFactory for polymorphic deserialization of Validator subtypes using a type discriminator field.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static SubTypeTypeAdapterFactory of(Class<?> baseClass, String typeFieldName)
  public SubTypeTypeAdapterFactory registerSubType(Class<?> clazz, String name)
  public TypeAdapter<T> create(Gson gson, TypeToken<T> type)

Fields:
private final Class<?> baseClassType
private final String typeFieldName
private final Map<Class<?>,String> classToName
