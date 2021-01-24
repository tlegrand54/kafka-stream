/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.coding4fun.kafka.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class EnhancedEndOfCure extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7777387326000541558L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EnhancedEndOfCure\",\"namespace\":\"com.coding4fun.kafka.models\",\"fields\":[{\"name\":\"Date\",\"type\":\"string\"},{\"name\":\"ItemCode\",\"type\":\"string\"},{\"name\":\"CureEquipmentId\",\"type\":\"string\"},{\"name\":\"ShiftCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EnhancedEndOfCure> ENCODER =
      new BinaryMessageEncoder<EnhancedEndOfCure>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EnhancedEndOfCure> DECODER =
      new BinaryMessageDecoder<EnhancedEndOfCure>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EnhancedEndOfCure> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EnhancedEndOfCure> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EnhancedEndOfCure> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EnhancedEndOfCure>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EnhancedEndOfCure to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EnhancedEndOfCure from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EnhancedEndOfCure instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EnhancedEndOfCure fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence Date;
   private java.lang.CharSequence ItemCode;
   private java.lang.CharSequence CureEquipmentId;
   private java.lang.CharSequence ShiftCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EnhancedEndOfCure() {}

  /**
   * All-args constructor.
   * @param Date The new value for Date
   * @param ItemCode The new value for ItemCode
   * @param CureEquipmentId The new value for CureEquipmentId
   * @param ShiftCode The new value for ShiftCode
   */
  public EnhancedEndOfCure(java.lang.CharSequence Date, java.lang.CharSequence ItemCode, java.lang.CharSequence CureEquipmentId, java.lang.CharSequence ShiftCode) {
    this.Date = Date;
    this.ItemCode = ItemCode;
    this.CureEquipmentId = CureEquipmentId;
    this.ShiftCode = ShiftCode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Date;
    case 1: return ItemCode;
    case 2: return CureEquipmentId;
    case 3: return ShiftCode;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Date = (java.lang.CharSequence)value$; break;
    case 1: ItemCode = (java.lang.CharSequence)value$; break;
    case 2: CureEquipmentId = (java.lang.CharSequence)value$; break;
    case 3: ShiftCode = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'Date' field.
   * @return The value of the 'Date' field.
   */
  public java.lang.CharSequence getDate() {
    return Date;
  }


  /**
   * Sets the value of the 'Date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.Date = value;
  }

  /**
   * Gets the value of the 'ItemCode' field.
   * @return The value of the 'ItemCode' field.
   */
  public java.lang.CharSequence getItemCode() {
    return ItemCode;
  }


  /**
   * Sets the value of the 'ItemCode' field.
   * @param value the value to set.
   */
  public void setItemCode(java.lang.CharSequence value) {
    this.ItemCode = value;
  }

  /**
   * Gets the value of the 'CureEquipmentId' field.
   * @return The value of the 'CureEquipmentId' field.
   */
  public java.lang.CharSequence getCureEquipmentId() {
    return CureEquipmentId;
  }


  /**
   * Sets the value of the 'CureEquipmentId' field.
   * @param value the value to set.
   */
  public void setCureEquipmentId(java.lang.CharSequence value) {
    this.CureEquipmentId = value;
  }

  /**
   * Gets the value of the 'ShiftCode' field.
   * @return The value of the 'ShiftCode' field.
   */
  public java.lang.CharSequence getShiftCode() {
    return ShiftCode;
  }


  /**
   * Sets the value of the 'ShiftCode' field.
   * @param value the value to set.
   */
  public void setShiftCode(java.lang.CharSequence value) {
    this.ShiftCode = value;
  }

  /**
   * Creates a new EnhancedEndOfCure RecordBuilder.
   * @return A new EnhancedEndOfCure RecordBuilder
   */
  public static com.coding4fun.kafka.models.EnhancedEndOfCure.Builder newBuilder() {
    return new com.coding4fun.kafka.models.EnhancedEndOfCure.Builder();
  }

  /**
   * Creates a new EnhancedEndOfCure RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EnhancedEndOfCure RecordBuilder
   */
  public static com.coding4fun.kafka.models.EnhancedEndOfCure.Builder newBuilder(com.coding4fun.kafka.models.EnhancedEndOfCure.Builder other) {
    if (other == null) {
      return new com.coding4fun.kafka.models.EnhancedEndOfCure.Builder();
    } else {
      return new com.coding4fun.kafka.models.EnhancedEndOfCure.Builder(other);
    }
  }

  /**
   * Creates a new EnhancedEndOfCure RecordBuilder by copying an existing EnhancedEndOfCure instance.
   * @param other The existing instance to copy.
   * @return A new EnhancedEndOfCure RecordBuilder
   */
  public static com.coding4fun.kafka.models.EnhancedEndOfCure.Builder newBuilder(com.coding4fun.kafka.models.EnhancedEndOfCure other) {
    if (other == null) {
      return new com.coding4fun.kafka.models.EnhancedEndOfCure.Builder();
    } else {
      return new com.coding4fun.kafka.models.EnhancedEndOfCure.Builder(other);
    }
  }

  /**
   * RecordBuilder for EnhancedEndOfCure instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EnhancedEndOfCure>
    implements org.apache.avro.data.RecordBuilder<EnhancedEndOfCure> {

    private java.lang.CharSequence Date;
    private java.lang.CharSequence ItemCode;
    private java.lang.CharSequence CureEquipmentId;
    private java.lang.CharSequence ShiftCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.coding4fun.kafka.models.EnhancedEndOfCure.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Date)) {
        this.Date = data().deepCopy(fields()[0].schema(), other.Date);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ItemCode)) {
        this.ItemCode = data().deepCopy(fields()[1].schema(), other.ItemCode);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.CureEquipmentId)) {
        this.CureEquipmentId = data().deepCopy(fields()[2].schema(), other.CureEquipmentId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.ShiftCode)) {
        this.ShiftCode = data().deepCopy(fields()[3].schema(), other.ShiftCode);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing EnhancedEndOfCure instance
     * @param other The existing instance to copy.
     */
    private Builder(com.coding4fun.kafka.models.EnhancedEndOfCure other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.Date)) {
        this.Date = data().deepCopy(fields()[0].schema(), other.Date);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ItemCode)) {
        this.ItemCode = data().deepCopy(fields()[1].schema(), other.ItemCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CureEquipmentId)) {
        this.CureEquipmentId = data().deepCopy(fields()[2].schema(), other.CureEquipmentId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ShiftCode)) {
        this.ShiftCode = data().deepCopy(fields()[3].schema(), other.ShiftCode);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'Date' field.
      * @return The value.
      */
    public java.lang.CharSequence getDate() {
      return Date;
    }


    /**
      * Sets the value of the 'Date' field.
      * @param value The value of 'Date'.
      * @return This builder.
      */
    public com.coding4fun.kafka.models.EnhancedEndOfCure.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Date = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Date' field has been set.
      * @return True if the 'Date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Date' field.
      * @return This builder.
      */
    public com.coding4fun.kafka.models.EnhancedEndOfCure.Builder clearDate() {
      Date = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ItemCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getItemCode() {
      return ItemCode;
    }


    /**
      * Sets the value of the 'ItemCode' field.
      * @param value The value of 'ItemCode'.
      * @return This builder.
      */
    public com.coding4fun.kafka.models.EnhancedEndOfCure.Builder setItemCode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ItemCode = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ItemCode' field has been set.
      * @return True if the 'ItemCode' field has been set, false otherwise.
      */
    public boolean hasItemCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ItemCode' field.
      * @return This builder.
      */
    public com.coding4fun.kafka.models.EnhancedEndOfCure.Builder clearItemCode() {
      ItemCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'CureEquipmentId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCureEquipmentId() {
      return CureEquipmentId;
    }


    /**
      * Sets the value of the 'CureEquipmentId' field.
      * @param value The value of 'CureEquipmentId'.
      * @return This builder.
      */
    public com.coding4fun.kafka.models.EnhancedEndOfCure.Builder setCureEquipmentId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.CureEquipmentId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'CureEquipmentId' field has been set.
      * @return True if the 'CureEquipmentId' field has been set, false otherwise.
      */
    public boolean hasCureEquipmentId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'CureEquipmentId' field.
      * @return This builder.
      */
    public com.coding4fun.kafka.models.EnhancedEndOfCure.Builder clearCureEquipmentId() {
      CureEquipmentId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ShiftCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getShiftCode() {
      return ShiftCode;
    }


    /**
      * Sets the value of the 'ShiftCode' field.
      * @param value The value of 'ShiftCode'.
      * @return This builder.
      */
    public com.coding4fun.kafka.models.EnhancedEndOfCure.Builder setShiftCode(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.ShiftCode = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ShiftCode' field has been set.
      * @return True if the 'ShiftCode' field has been set, false otherwise.
      */
    public boolean hasShiftCode() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ShiftCode' field.
      * @return This builder.
      */
    public com.coding4fun.kafka.models.EnhancedEndOfCure.Builder clearShiftCode() {
      ShiftCode = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EnhancedEndOfCure build() {
      try {
        EnhancedEndOfCure record = new EnhancedEndOfCure();
        record.Date = fieldSetFlags()[0] ? this.Date : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ItemCode = fieldSetFlags()[1] ? this.ItemCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.CureEquipmentId = fieldSetFlags()[2] ? this.CureEquipmentId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.ShiftCode = fieldSetFlags()[3] ? this.ShiftCode : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EnhancedEndOfCure>
    WRITER$ = (org.apache.avro.io.DatumWriter<EnhancedEndOfCure>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EnhancedEndOfCure>
    READER$ = (org.apache.avro.io.DatumReader<EnhancedEndOfCure>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.Date);

    out.writeString(this.ItemCode);

    out.writeString(this.CureEquipmentId);

    out.writeString(this.ShiftCode);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.Date = in.readString(this.Date instanceof Utf8 ? (Utf8)this.Date : null);

      this.ItemCode = in.readString(this.ItemCode instanceof Utf8 ? (Utf8)this.ItemCode : null);

      this.CureEquipmentId = in.readString(this.CureEquipmentId instanceof Utf8 ? (Utf8)this.CureEquipmentId : null);

      this.ShiftCode = in.readString(this.ShiftCode instanceof Utf8 ? (Utf8)this.ShiftCode : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.Date = in.readString(this.Date instanceof Utf8 ? (Utf8)this.Date : null);
          break;

        case 1:
          this.ItemCode = in.readString(this.ItemCode instanceof Utf8 ? (Utf8)this.ItemCode : null);
          break;

        case 2:
          this.CureEquipmentId = in.readString(this.CureEquipmentId instanceof Utf8 ? (Utf8)this.CureEquipmentId : null);
          break;

        case 3:
          this.ShiftCode = in.readString(this.ShiftCode instanceof Utf8 ? (Utf8)this.ShiftCode : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










