package scs;




import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Sheet
public class DashcamUploadSheet {

	@SheetColumn("Vendor Name")	
    private String	vendorName;
	
	@SheetColumn("Camera Type")	
	private String cameraType;
	
	@SheetColumn("Camera Product Code")	
	private String cameraProductCode;
	
	@SheetColumn("Serial Number")	
	private String serialNumber;
	
	@SheetColumn("Inward Serial Number")	
	private String inwardSerialNumber;
	
	
	@SheetColumn("Description")
	private String description;
	
	@SheetColumn("SFDC Case")	
	private String sfdcCase;
	
	@SheetColumn("Vehicle Name")
	private String vehicleName;

	
	public String getVendorName() {
		return vendorName;
	}

	
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	
	public String getCameraType() {
		return cameraType;
	}

	
	public void setCameraType(String cameraType) {
		this.cameraType = cameraType;
	}

	
	public String getCameraProductCode() {
		return cameraProductCode;
	}

	
	public void setCameraProductCode(String cameraProductCode) {
		this.cameraProductCode = cameraProductCode;
	}

	
	public String getSerialNumber() {
		return serialNumber;
	}

	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	
	public String getInwardSerialNumber() {
		return inwardSerialNumber;
	}

	
	public void setInwardSerialNumber(String inwardSerialNumber) {
		this.inwardSerialNumber = inwardSerialNumber;
	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}

	
	public String getSfdcCase() {
		return sfdcCase;
	}

	
	public void setSfdcCase(String sfdcCase) {
		this.sfdcCase = sfdcCase;
	}

	
	public String getVehicleName() {
		return vehicleName;
	}

	
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DashcamUploadSheet [vendorName=");
		builder.append(vendorName);
		builder.append(", cameraType=");
		builder.append(cameraType);
		builder.append(", cameraProductCode=");
		builder.append(cameraProductCode);
		builder.append(", serialNumber=");
		builder.append(serialNumber);
		builder.append(", inwardSerialNumber=");
		builder.append(inwardSerialNumber);
		builder.append(", description=");
		builder.append(description);
		builder.append(", sfdcCase=");
		builder.append(sfdcCase);
		builder.append(", vehicleName=");
		builder.append(vehicleName);
		builder.append("]");
		return builder.toString();
	}
}

