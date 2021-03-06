/*
 * This file is generated by jOOQ.
 */
package net.runelite.client.database.data.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import net.runelite.client.database.data.Indexes;
import net.runelite.client.database.data.Keys;
import net.runelite.client.database.data.Public;
import net.runelite.client.database.data.tables.records.LoottrackereventsRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.11.12"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Loottrackerevents extends TableImpl<LoottrackereventsRecord>
{

	private static final long serialVersionUID = -824670812;

	/**
	 * The reference instance of <code>PUBLIC.LOOTTRACKEREVENTS</code>
	 */
	public static final Loottrackerevents LOOTTRACKEREVENTS = new Loottrackerevents();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<LoottrackereventsRecord> getRecordType()
	{
		return LoottrackereventsRecord.class;
	}

	/**
	 * The column <code>PUBLIC.LOOTTRACKEREVENTS.UNIQUEID</code>.
	 */
	public final TableField<LoottrackereventsRecord, UUID> UNIQUEID = createField("UNIQUEID", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.LOOTTRACKEREVENTS.EVENTID</code>.
	 */
	public final TableField<LoottrackereventsRecord, String> EVENTID = createField("EVENTID", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.LOOTTRACKEREVENTS.TYPE</code>.
	 */
	public final TableField<LoottrackereventsRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.LOOTTRACKEREVENTS.TIME</code>.
	 */
	public final TableField<LoottrackereventsRecord, Timestamp> TIME = createField("TIME", org.jooq.impl.SQLDataType.TIMESTAMP.precision(6).nullable(false), this, "");

	/**
	 * Create a <code>PUBLIC.LOOTTRACKEREVENTS</code> table reference
	 */
	public Loottrackerevents()
	{
		this(DSL.name("LOOTTRACKEREVENTS"), null);
	}

	/**
	 * Create an aliased <code>PUBLIC.LOOTTRACKEREVENTS</code> table reference
	 */
	public Loottrackerevents(String alias)
	{
		this(DSL.name(alias), LOOTTRACKEREVENTS);
	}

	/**
	 * Create an aliased <code>PUBLIC.LOOTTRACKEREVENTS</code> table reference
	 */
	public Loottrackerevents(Name alias)
	{
		this(alias, LOOTTRACKEREVENTS);
	}

	private Loottrackerevents(Name alias, Table<LoottrackereventsRecord> aliased)
	{
		this(alias, aliased, null);
	}

	private Loottrackerevents(Name alias, Table<LoottrackereventsRecord> aliased, Field<?>[] parameters)
	{
		super(alias, null, aliased, parameters, DSL.comment(""));
	}

	public <O extends Record> Loottrackerevents(Table<O> child, ForeignKey<O, LoottrackereventsRecord> key)
	{
		super(child, key, LOOTTRACKEREVENTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema()
	{
		return Public.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Index> getIndexes()
	{
		return Arrays.<Index>asList(Indexes.PRIMARY_KEY_B);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<LoottrackereventsRecord> getPrimaryKey()
	{
		return Keys.PK_EVENTUNIQUEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<LoottrackereventsRecord>> getKeys()
	{
		return Arrays.<UniqueKey<LoottrackereventsRecord>>asList(Keys.PK_EVENTUNIQUEID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Loottrackerevents as(String alias)
	{
		return new Loottrackerevents(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Loottrackerevents as(Name alias)
	{
		return new Loottrackerevents(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public Loottrackerevents rename(String name)
	{
		return new Loottrackerevents(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public Loottrackerevents rename(Name name)
	{
		return new Loottrackerevents(name, null);
	}
}
