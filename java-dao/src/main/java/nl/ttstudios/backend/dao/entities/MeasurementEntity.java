package nl.ttstudios.backend.dao.entities;

import com.ttstudios.common.db.database_connectivity.MongoEntity;
import org.mongojack.MongoCollection;

import javax.persistence.Id;
import java.util.Date;

import static nl.ttstudios.backend.dao.MappingConstants.COLLECTION_MEASUREMENTS;
import static nl.ttstudios.backend.dao.MappingConstants.DB;

/**
 * Created by ttseng on 5/6/17.
 */
@MongoCollection(name = "Measurements")
public class MeasurementEntity implements MongoEntity {

    @Id
    private String _id;

    private String uID;

    private double measurement;

    private String measurementUnit;

    private Date unixTimestamp;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Date getUnixTimestamp() {
        return unixTimestamp;
    }

    public void setUnixTimestamp(Date unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
    }

    @Override
    public String getCollectionName() {
        return COLLECTION_MEASUREMENTS;
    }

    @Override
    public String getDatabaseName() {
        return DB;
    }
}